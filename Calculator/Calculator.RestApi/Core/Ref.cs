namespace CloudComputing.Lab2.Calculator.RestApi.Core
{
    public class Ref<TValue>
        where TValue : struct
    {
        public Ref(TValue value)
        {
            Value = value;
        }

        public TValue Value { get; set; }

        public static implicit operator TValue(Ref<TValue> @ref) => @ref.Value;

        public static implicit operator Ref<TValue>(TValue value) => value.ToRef();
    }

    public static class RefHelper
    {
        public static Ref<TValue> ToRef<TValue>(this TValue value)
            where TValue : struct => new Ref<TValue>(value);
    }
}