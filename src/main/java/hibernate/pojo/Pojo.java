package hibernate.pojo;

public class Pojo
{
    private Metadata metadata;

    private Data data;

    public Metadata getMetadata ()
    {
        return metadata;
    }

    public void setMetadata (Metadata metadata)
    {
        this.metadata = metadata;
    }

    public Data getData ()
    {
        return data;
    }

    public void setData (Data data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [metadata = "+metadata+", data = "+data+"]";
    }
}