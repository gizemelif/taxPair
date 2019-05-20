package hibernate.pojo;

public class BadRequest
{
    private Metadata metadata;

    private String data;

    public Metadata getMetadata ()
    {
        return metadata;
    }

    public void setMetadata (Metadata metadata)
    {
        this.metadata = metadata;
    }

    public String getData ()
    {
        return data;
    }

    public void setData (String data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [metadata = "+metadata+", data = "+data+"]";
    }
}
