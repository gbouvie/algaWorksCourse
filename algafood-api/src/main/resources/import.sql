insert into cozinha (id, nome) values(1, 'Tailandesa');
insert into cozinha (id, nome) values(2, 'Indiana');

insert into restaurante (id, nome, taxa_frete, cozinha_id) values(1, 'Pizzaria Francesco', 10.00, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values(2, 'Xis do Jiraya', 7.50, 1);
insert into restaurante (id, nome, taxa_frete, cozinha_id) values(3, 'Alternative Burger', 8.00, 2);

insert into estado (id, nome) values(1, 'Minas Gerais');
insert into estado (id, nome) values(2, 'São Paulo');
insert into estado (id, nome) values(3, 'Ceará');

insert into cidade (id, nome, estado_id) values(1, 'Uberlândia', 1);
insert into cidade (id, nome, estado_id) values(2, 'Belo Horizonte', 1);
insert into cidade (id, nome, estado_id) values(3, 'São Paulo', 2);
insert into cidade (id, nome, estado_id) values(4, 'Campinas', 2);
insert into cidade (id, nome, estado_id) values(5, 'Fortaleza', 3);

insert into forma_pagamento (id, descricao) values(1, 'Cartão de Crédito');
insert into forma_pagamento (id, descricao) values(2, 'Cartão de Débito');
insert into forma_pagamento (id, descricao) values(3, 'Dinheiro');

insert into permissao (id, nome, descricao) values(1, 'CONSULTAR_COZINHAS', 'Permite consultar cozinhas');
insert into permissao (id, nome, descricao) values(2, 'EDITAR_COZINHAS', 'Permite editar cozinhas');