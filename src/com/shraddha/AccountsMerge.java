package com.shraddha;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class AccountsMerge {
    public static ArrayList<String> getOneList(List<String> list1, List<String> list2) {
        HashSet<String> set = new HashSet<>();
        set.addAll(list1);
        set.addAll(list2);

        ArrayList<String> list = new ArrayList<>();
        if (set.size() < (list1.size() - 1) + list2.size()) list.addAll(set);
        return list;
    }

    public static void accountsMerge(List<List<String>> accounts) {
        List<List<String>> ans = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i < accounts.size() - 1; i++) {
            for (int j = i + 1; j < accounts.size(); j++) {
                if (accounts.get(i).get(0).equals(accounts.get(j).get(0)))
                    temp = getOneList(accounts.get(i), accounts.get(j));
                if (temp.size() > 0) ans.add(temp);
            }
        }
        System.out.println(ans.size());
        System.out.println(ans);
    }

    public static void main(String[] args) {
        List<List<String>> accounts = new ArrayList<>();
        accounts.add(new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john_newyork@mail.com")));
        accounts.add(new ArrayList<>(Arrays.asList("John", "johnsmith@mail.com", "john00@mail.com")));
        accounts.add(new ArrayList<>(Arrays.asList("Mary", "mary@mail.com")));
        accounts.add(new ArrayList<>(Arrays.asList("John", "johnnybravo@mail.com")));

        System.out.println("Input list of accounts = ");
        System.out.println(accounts);
        accountsMerge(accounts);
    }
}
