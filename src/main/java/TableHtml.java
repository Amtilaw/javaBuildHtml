public class TableHtml {
    private String strHtml;
    private Agent[] agents;

    public TableHtml(Agent[] agents){
        this.strHtml = build();
        this.agents = agents;
    }

    public String build(){

        String header =  "    <div class=\"tableau\">\n" +
                "        <table>\n" +
                "            <thead>\n" +
                "                <tr>\n" ;

        String headerValue =  "                    <th>Id</th>\n" + balise("th", agents[0].getId());
                "                    <th>Pseudo</th>\n";

        return

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
                "    </div>\n";
    }



}
}
