package stepik.TextPerRole;

public class TextPerRole {
    private void printTextPerRole() {
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


        StringBuilder role = new StringBuilder();
        StringBuilder output = new StringBuilder();


        for (int i = 0; i < roles.length; i++) {
            role.append(roles[i]).append(":");
            output.append(role);
            output.append("\n");
            for (int j = 0; j < textLines.length; j++) {
                if (textLines[j].startsWith(role.toString())) {
                    textLines[j] = textLines[j].replace(role.toString(), "");
                    textLines[j] = textLines[j].trim();
                    output.append(j + 1 + ") ");
                    output.append(textLines[j]);
                    if (j != textLines.length - 1) {
                        output.append("\n");
                    }
                }


            }
            output.append("\n");
            role.delete(0, role.length());
        }
        output.trimToSize();
        System.out.println(output.toString());

    }
}

