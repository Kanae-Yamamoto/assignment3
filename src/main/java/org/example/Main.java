package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("佐藤", "56歳。既往歴は糖尿病。食事療法にて治療中です。");
        userMap.put("菊池", "40歳。既往歴は高血圧。内服薬にて治療中です。");
        userMap.put("田中", "67歳。既往歴は大腸ポリープ。内視鏡手術により治療済みです。");
        userMap.put("鈴木", "71歳。既往歴はCOPD。酸素ボンベを使用中です。");
        userMap.put("横田", "43歳。既往歴は脂質異常症。内服薬にて治療中です。");
        userMap.put("西川", "35歳。既往歴は逆流性食道炎。内服薬にて治療中です。");

        for (String key : userMap.keySet()) {
            System.out.println(key + "さんは" + userMap.get(key));
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ユーザー名を入力して下さい:");
        String name = scanner.nextLine();

        try {
            if (userMap.containsKey(name)) {
                System.out.println(name + "さんは" + userMap.get(name));
            } else {
                throw new UserNotFoundException("ユーザーが見つかりません");
            }
        } catch (UserNotFoundException e) {
            System.out.println("このユーザーは見つかりません。もう一度名前を入力してください。");
        }
    }
}
