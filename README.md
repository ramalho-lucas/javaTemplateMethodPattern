# javaTemplateMethodPattern

* É um design pattern (padrão de projeto) comportamental que define o esqueleto de um algoritmo na superclasse, mas permite que as subclasses sobrescrevam etapas do algoritimo sem alterar suas estrutura

* O metodo esqueleto é composto pelo código que essas classes tem em comum, permitindo que algumas partes sejam modificadas pela subclasse que o implementa, conseguindo manter o código repetido em um só lugar.

* Vantagens:
  * Os clientes podem sobrescrever certas partes de um algoritmo grande para que sejam menos afetados pelas mudanças que ocorrem em outras partes do algoritmo
  * O código duplicado pode ser colocado dentro de uma superclasse
  
* Desvantagens:
  * Possui um alto grau de dependencia da interface fachada
  * Alguns clientes podem ser limitados pelo esqueleto fornecido pelo algoritmo.

