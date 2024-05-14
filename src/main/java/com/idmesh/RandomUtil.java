package com.idmesh;

public class RandomUtil {
public static String randomString(int length) {
String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
StringBuilder sb = new StringBuilder();
for (int i = 0; i < length; i++) {
int number = (int) (Math.random() * str.length());
sb.append(str.charAt(number));
}
return sb.toString();
}

public static String randomEmail() {
return randomString(8) + "@" + randomString(5) + ".com";
}

public static String randomPhone() {
return "1" + randomString(10);
}

public static String randomCode() {
return randomString(10);
}

public static String randomPassword() {
return randomString(8);
}

public static String genRandom(String type, String fieldName) {
switch (type.toLowerCase()) {
case "string":
if (fieldName.toLowerCase().contains("email")) {
return randomEmail();
} else if (fieldName.toLowerCase().contains("phone")) {
return randomPhone();
} else if (fieldName.toLowerCase().contains("password")) {
return randomPassword();
} else if (fieldName.toLowerCase().contains("code")) {
return randomCode();
} else {
return randomString(8);
}
case "integer":
return String.valueOf((int) (Math.random() * 100));
case "number":
return String.valueOf(Math.random() * 100);
default:
return "";
}
}
}
