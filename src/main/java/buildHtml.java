import java.io.*;
import java.util.ArrayList;

public class buildHtml {
    final static String path = "/home/jeanjean/Documents/Epsi_3_emes/mspr/resources";

    public static void main(String[] args) {

        Agent listeAgent[];

        HeaderHtml header = new HeaderHtml("Liste des agents");
        TableHtml table = new TableHtml(listeAgent);
        BodyHtml body = new BodyHtml(table);

        createAgents();


        try {
            File myObj = new File("index.html");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());

                FileWriter htmlFile = new FileWriter("index.html");
                htmlFile.write(header.buildHeaderStr() +
                        "\n" +
                        "<body>\n" +
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
                        "</body>\n" +
                        "<footer>\n" +
                        "\n" +
                        "</footer>\n" +
                        "</html>");
                htmlFile.close();
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static ArrayList<Agent> createAgents(){
        File file = new File(path, "staff.txt");
        ArrayList<Agent> agents = new ArrayList<Agent>();
        int countLine = 0;
        try(
            var readerAgent = new BufferedReader(new FileReader(file))) {
            String lineAgent = null;
            while ((lineAgent = readerAgent.readLine()) != null) {
                countLine++;
                System.out.println("Creation de agent : " + lineAgent);
               Agent agent = new Agent(lineAgent, countLine);
               agents.add(agent);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println(agents.toArray());
        return agents;
    }
}
