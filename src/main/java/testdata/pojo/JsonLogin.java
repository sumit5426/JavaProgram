package testdata.pojo;

import java.util.List;

public class JsonLogin {
    private List<Data> data; // Change from loginDetailsList to data

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }
}
