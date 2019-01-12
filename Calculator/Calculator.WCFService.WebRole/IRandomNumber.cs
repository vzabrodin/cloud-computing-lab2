using System.Runtime.Serialization;
using System.ServiceModel;

namespace CloudComputing.Lab2.Calculator.WCFService.WebRole
{
    [ServiceContract]
    public interface IRandomNumber
    {
        [OperationContract]
        int GetRandomNumber(int minValue, int maxValue);

        [OperationContract]
        string GetData(int value);

        [OperationContract]
        CompositeType GetDataUsingDataContract(CompositeType composite);
    }

    [DataContract]
    public class CompositeType
    {
        [DataMember]
        public bool BoolValue { get; set; } = true;

        [DataMember]
        public string StringValue { get; set; } = "Hello ";
    }
}
