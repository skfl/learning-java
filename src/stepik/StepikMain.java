package stepik;


import stepik.mergeSort.MergeSort;

import java.util.Arrays;
import java.util.Random;

public class StepikMain {
    public static void main(String[] args) {
        String[] roles = {
                "Городничий", "Аммос Федорович",
                "Артемий Филиппович",
                "Лука Лукич"};
        String[] textLines = {
                "Городничий: Я пригласил вас, господа, с тем, чтобы сообщить вам пренеприятное известие: к нам едет ревизор.",
                "Аммос Федорович: Как ревизор?",
                "Артемий Филиппович: Как ревизор?",
                "Городничий: Ревизор из Петербурга, инкогнито. И еще с секретным предписаньем.",
                "Аммос Федорович: Вот те на!",
                "Артемий Филиппович: Вот не было заботы, так подай!",
                "Лука Лукич: Господи боже! еще и с секретным предписаньем!"};

        StringBuilder s = new StringBuilder();
        StringBuilder role = new StringBuilder();
        int index = 0;

        for (int i = 0; i < roles.length; i++) {
            role.append(roles[i]);
            role.append(":\n");
        }
        String res = role.toString();
        System.out.println(res);




        int v = 0;
        StringBuilder n = new StringBuilder(roles[1]);

    }
}
