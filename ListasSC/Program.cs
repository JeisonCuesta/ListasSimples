using System;

namespace Listas
{
    class Program
    {
        static void Main(string[] args)
        {
            lista li = new lista();

            li.insertar(1);
            li.insertar(2);
            li.insertar(3);

            li.recorrerlista();
        }
    }

    class nodo
    {
        private int dato;
        private nodo siguiente = null;

        public int Dato { get => dato; set => dato = value; }
        internal nodo Siguiente { get => siguiente; set => siguiente = value; }

        public override string ToString()
        {
            return string.Format("(0)", dato);
        }
    }

    class lista
    {
        private nodo inicio;
        private nodo aux;

        public lista()
        {
            inicio = new nodo();
            inicio.Siguiente = null;
        }

        public void recorrerlista()
        {
            aux = inicio;
            while (aux.Siguiente != null)
            {
                aux = aux.Siguiente;
                int d = aux.Dato;
                Console.Write("(0), ", d);
            }
            Console.WriteLine();
        }

        public void insertar(int x)
        {
            aux = inicio;
            while (aux.Siguiente != null)
            {
                aux = aux.Siguiente;
            }
            nodo temp = new nodo();
            temp.Dato = x;
            temp.Siguiente = null;
            aux.Siguiente = temp;
        }

    }

}
