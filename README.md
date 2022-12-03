![Open in Codespaces](https://classroom.github.com/assets/open-in-codespaces-abfff4d4e15f9e1bd8274d9a39a0befe03a0632bb0f153d0ec72ff541cedbe34.svg)

# Projeto 3 - Frota fase 1

## Nota: 10,5

## Comentários
	- exceção ao incluir no main. Assim, não pude testar os outros requisitos. Inspeção de código apenas.
	- tem horas que o exagero atrapalha. Para que a localização de um veículo em uma frota usa **três** métodos?
	- classe VeiculoGastos ferindo mortalmente a modularidade: código construtor repetido muitas vezes (use um init)
	- relatório ferindo mortalmente o encapsulamento: o veículo deve fornecer seu relatório
	
### Modelagem: 1,5/2 pontos. 
	- cadê a frota no diagrama?
	
### Implementação dos requisitos de acordo com a modelagem: 5,2/6 pontos. 
	- Adicionar rota (com autonomia)  1,2/2: não verifica autonomia
	- IPVA  1/1
	- Seguro 1/1
	- Outros custos 2/2
	

### Programa principal e seus requisitos: 3,8/7 pontos.
	- Carregar e salvar  0,6/2: nome de arquivo no parâmetro (acoplamento). Usar constante. Salva só um veículo fixo
	- Incluir veículo 	0,6/1: dá exceção no final.(localizar?)
	- Incluir rotas em veículo 1/1 (sem autonomia)
	- Localizar um veículo 0,6/1: código lá, sem rodar pela exceção de inserção
	- Imprimir um relatório do veículo 1/2: método do veículo, não lógica no main

# Rota Veiculos 
O Objetivo desse trabalho foi o desenvolvimento de uma solução para otimizar os gastos da empresa de entrega de encomendas. A aplicação desenvolvolvida de forma modular com classes veiculos e suas especializações, entre outras. 
O sistema desevolvido conta com varios recurso que visa facilitar o cadastro de novos veiculos na frota da empresa, calcular gastos por rota, gasto por veiculo, simplificando o dia - a - dia da empresa no geral. 

## Alunos integrantes da equipe

* André Avelar Moriya Sathler
* Francisley Magalhaes

## Professores responsáveis

* João Caram
* Cleiton Silva 

