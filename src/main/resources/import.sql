-- Realizando os inserts nas tabelas do banco de dados.

-- Insert na tabela produto.
insert into produto (descricao, valor) values ('Água sem gás', 5.00);
insert into produto (descricao, valor) values ('Guaraná Kuat - 2L', 8.50);
insert into produto (descricao, valor) values ('Fanta', 7.00);
insert into produto (descricao, valor) values ('Suco uva', 6.50);
insert into produto (descricao, valor) values ('Vodka Smirnoff', 9.00);

--Insert na tabela Venda.
insert into Venda (data, pessoa_id) values (current_date, 1);
insert into Venda (data, pessoa_id) values (current_date, 2);
insert into Venda (data, pessoa_id) values (current_date, 1);

-- Insert na tabela item_Venda.
insert into item_Venda (produto_id, quantidade, venda_id) values (1, 1, 1);
insert into item_Venda (produto_id, quantidade, venda_id) values (2, 1, 1);
insert into item_Venda (produto_id, quantidade, venda_id) values (3, 1, 2);
insert into item_Venda (produto_id, quantidade, venda_id) values (4, 1, 2);
insert into item_Venda (produto_id, quantidade, venda_id) values (5, 1, 2);
insert into item_Venda (produto_id, quantidade, venda_id) values (5, 1, 3);
insert into item_Venda (produto_id, quantidade, venda_id) values (4, 2, 3);

-- Insert na tabela pessoa_fisica
insert into pessoa_fisica (id, nome, cpf, telefone) values (1, 'Joaquim', '111.111.111-11', '1111-1111');

-- Insert na tabela pessoa_juridica
insert into pessoa_juridica (id, nome, cnpj, telefone) values (2, 'Restaurante Bom de Prato', '11.111.111/0001-11', '2222-2222');