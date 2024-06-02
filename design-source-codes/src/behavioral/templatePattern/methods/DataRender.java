package behavioral.templatePattern.methods;

public abstract class DataRender {

    public void render(){

        String data = readData();
        String processedData = processData(data);
        System.out.printf("Processed: %s", processedData);

    }


    public abstract String readData();
    public abstract String processData(String data);


}
