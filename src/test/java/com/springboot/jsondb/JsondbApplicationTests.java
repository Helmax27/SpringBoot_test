package com.springboot.jsondb;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.apache.http.client.fluent.Request;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Set;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class JsondbApplicationTests {

	@Test
	public void createUser() throws IOException {
		Set<Users> oldUserss = getUserss();
		Users newUsers = new Users();
		long userId = createUsers(newUsers);
		Set<Users> newUserss = getUserss();
		oldUserss.add(newUsers.withId(userId));
		Assert.assertEquals(newUserss, oldUserss);
	}

	private long createUsers(Users newUsers) throws IOException {
		String json = Request.Get("http://localhost:8080/users/list").execute().returnContent().asString();
		JsonElement parsed = new JsonParser().parse(json);
		JsonElement list = parsed.getAsJsonObject().get("Odject");
		return new Gson().fromJson(list, new TypeToken<Set<Users>>(){}.getType());
	}

	private Set<Users> getUserss() {
		return null;
	}

}
