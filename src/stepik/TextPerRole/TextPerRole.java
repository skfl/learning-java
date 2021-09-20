package stepik.TextPerRole;

public class TextPerRole {
    private String printTextPerRole(String[] roles, String[] textLines) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < roles.length; i++) {
            s.append(roles[i]);
            s.append(":\n");
            for (int j = 0; j < textLines.length; j++) {

            }
        }
        String res = s.toString();
        System.out.println(res);


        return "";
    }
}
