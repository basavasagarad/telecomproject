package com.telecomproject.telecom;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MytelController {

	private final MytelService service = new MytelService();

	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/recharge")
	public String showRechargeForm() {
		return "recharge";
	}

	@PostMapping("/recharge")
	public String doRecharge(@RequestParam String mobile, @RequestParam int packId, Model model) {
		String result = service.processRecharge(mobile, packId);
		model.addAttribute("message", result);
		return "result";
	}

	@GetMapping("/bill")
	public String showBillForm() {
		return "bill";
	}

	@PostMapping("/bill")
	public String payBill(@RequestParam String mobile, Model model) {
		String result = service.payBill(mobile);
		model.addAttribute("message", result);
		return "result";
	}

	@GetMapping("/convert")
	public String showConvertForm() {
		return "convert";
	}

	@PostMapping("/convert")
	public String convert(@RequestParam String mobile, @RequestParam int type, Model model) {
		String result = service.convertSim(mobile, type);
		model.addAttribute("message", result);
		return "result";
	}

	@GetMapping("/balance")
	public String showBalanceForm() {
		return "balance";
	}

	@PostMapping("/balance")
	public String checkBalance(@RequestParam String mobile, Model model) {
		String result = service.checkBalance(mobile);
		model.addAttribute("message", result);
		return "result";
	}

	@GetMapping("/profile")
	public String showProfileForm() {
		return "profile";
	}

	@PostMapping("/profile")
	public String showProfile(@RequestParam String mobile, Model model) {
		String result = service.getProfile(mobile);
		model.addAttribute("message", result);
		return "result";
	}
}
