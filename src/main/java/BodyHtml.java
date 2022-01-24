public class BodyHtml {
    private String strHtml;

    public BodyHtml(TableHtml table){
        this.strHtml = build();
    }

    public String build(){

        return "<body>\n" +
                "    <div class=\"header\">\n" +
                "        <h1>Liste des agents EZ</h1>\n" +
                "    </div>\n" +
                "    <div class=\"tableau\">\n" +
                "        <table>\n" +
                "            <thead>\n" +
                "                <tr>\n" +
                "                    <th>Id</th>\n" +
                "                    <th>Pseudo</th>\n" +
                "                </tr>\n" +
                "            </thead>\n" +
                "            <tbody>\n" +
                "            <tr>\n" +
                "              <td>1</td>\n" +
                "              <td><a href=\"ficheAgent.html?pseudo=Adrien\">Adrien</a></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "              <td>2</td>\n" +
                "              <td>edith</td>\n" +
                "            </tr>\n" +
                "            </tbody>\n" +
                "          </table>\n" +
                "    </div>\n" +
                "    \n" +
                "</body>\n";
    }

}
