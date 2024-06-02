package behavioral.templatePattern.methods;

public class XMLDataRender extends DataRender {

    @Override
    public String readData() {
        return "XML Data";
    }

    @Override
    public String processData(String data) {
        return "Processed" + data;
    }
}
