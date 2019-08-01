package br.com.labs;

import java.util.List;
import java.util.stream.Collectors;

public class FilterService {

	public List<User> execute(List<User> users,int points) {
		return users.stream().filter(user -> user.getPontos() > points).collect(Collectors.toList());
	}
}
