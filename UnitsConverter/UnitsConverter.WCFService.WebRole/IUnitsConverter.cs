using System.Collections.Generic;
using System.ServiceModel;
using CloudComputing.Lab2.UnitsConverter.Model;

namespace CloudComputing.Lab2.UnitsConverter.WCFService.WebRole
{
    [ServiceContract]
    public interface IUnitsConverter
    {
        [OperationContract]
        IEnumerable<UnitType> GetSupportedTypes();

        [OperationContract]
        IDictionary<UnitType, IEnumerable<string>> GetSupportedUnits();

        [OperationContract(Name = "GetSupportedUnitsByType")]
        IEnumerable<string> GetSupportedUnits(UnitType type);

        [OperationContract(Name = "IsUnitCodeSupported")]
        bool IsUnitSupported(string code);

        [OperationContract(Name = "IsUnitTypeSupported")]
        bool IsUnitSupported(UnitType type);

        [OperationContract]
        double Convert(string from, string to, double value);
    }
}
