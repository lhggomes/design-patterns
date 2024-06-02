package behavioral.templatePattern.test;

import behavioral.templatePattern.methods.CsvDataRender;
import behavioral.templatePattern.methods.DataRender;
import behavioral.templatePattern.methods.XMLDataRender;

public class Test {

    public static void main(String [] args){

        DataRender render = new XMLDataRender();
        render.render();

        DataRender csvRender = new CsvDataRender();
        render.render();

    }
}
