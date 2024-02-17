using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PrograIII_1
{
    class CalculadoraSimple : ICalculadora
    {
        public decimal Restar(decimal num1, decimal num2)
        {
            return num1 - num2;
        }

        public decimal Sumar(decimal num1, decimal num2)
        {
            return num1 + num2;
        }
    }
}
