package behavioral.templatePattern;

public class Test {

    public static void main(String [] args){

        DataRender render = new XMLDataRender();
        render.render();

        DataRender csvRender = new CsvDataRender();
        render.render();

    }
}
