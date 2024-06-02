package behavioral.templatePattern.methods;

public class CsvDataRender extends DataRender {

    @Override
    public String readData() {
        return "CSV Data";
    }

    @Override
    public String processData(String data) {
        return "Processed" + data;
    }
}
