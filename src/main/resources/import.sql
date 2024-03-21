-- Realizando os inserts nas tabelas do banco de dados.

-- Insert na tabela produto.
insert into produto (descricao, valor) values ('Água sem gás', 5.00);
insert into produto (descricao, valor) values ('Guaraná Kuat - 2L', 8.50);
insert into produto (descricao, valor) values ('Fanta', 7.00);
insert into produto (descricao, valor) values ('Suco uva', 6.50);
insert into produto (descricao, valor) values ('Vodka Smirnoff', 9.00);

--Insert na tabela Venda.
insert into Venda (data) values (current_date);
insert into Venda (data) values (current_date);

-- Insert na tabela item_Venda.
insert into item_Venda (produto_id, quantidade, venda_id) values (1, 1, 1);
insert into item_Venda (produto_id, quantidade, venda_id) values (2, 1, 1);
insert into item_Venda (produto_id, quantidade, venda_id) values (3, 1, 2);
insert into item_Venda (produto_id, quantidade, venda_id) values (4, 1, 2);
insert into item_Venda (produto_id, quantidade, venda_id) values (5, 1, 2);