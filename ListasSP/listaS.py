
class Nodo:
    def _int_(self,dato):
        self.siguiente= None
        self.info = dato

    def VerNodo(self):
        return self.info

class Lista:
    def _int_(self):
        self.inicio=None

    def vacia(self):
        if self.inicio==None:
            return true
        else:
            return false    
    
    def insertar(self,dato):
        temporal=Nodo(dato)
        temporal.siguiente=self.inicio
        self.inicio=temporal

    def mostrar(self):
        print() 
        temporal=self.inicio
        while temporal!=None:
            print(temporal.VerNodo(),end == ' ')   
            temporal = temporal.siguiente

    def limpiar(self):
        return self.inicio.clear

lista = Lista()

#push    
lista.insertar('1')
lista.insertar('2')
lista.insertar('3')

lista.mostrar()

#empty
pila.vacia()

            

