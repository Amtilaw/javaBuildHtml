public class HeaderHtml {
    private String title;
    private String strHtml;

    public HeaderHtml(String title){
        this.title = title;
        this.strHtml = "<html><head><title>"+ title + "</title><style>\n" +
                "\n" +
                "h1 {\n" +
                "\n" +
                "}\n" +
                "th,\n" +
                "td {\n" +
                "    border: 2px solid;\n" +
                "    padding: 5px 10px;\n" +
                "}\n" +
                "\n" +
                "table {\n" +
                "    width: 100%;\n" +
                "    max-width: 200px;\n" +
                "    \n" +
                "    margin: 0 auto;\n" +
                "    display: block;\n" +
                "    overflow-x: auto;\n" +
                "}\n" +
                "    </style>\n" +
                "</head>\n" +
                "\n";
    }

    public String buildHeaderStr(){
        return this.strHtml;
    }

}
