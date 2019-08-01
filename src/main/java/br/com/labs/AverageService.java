package br.com.labs;

import java.util.List;

public class AverageService {

	public double execute(List<User> users) {
		return users.stream().mapToInt(User::getPontos).average().orElse(0.0);
	}
}
