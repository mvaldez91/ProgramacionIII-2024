namespace PrograIII_1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello, World!");

            ICalculadora calculadora = new ICalculadora();
            decimal num1 = 10;
            decimal num2 = 10;
            Console.WriteLine($"La suma de {num1} + {num2} es igual a {calculadora.Sumar(num1, num2)}");
        }
    }
}