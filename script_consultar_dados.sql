SELECT nome, cpf, email FROM hospedes;

SELECT tipo, andar, valor_diaria FROM quartos WHERE disponivel = true;

SELECT h.nome, q.tipo, q.andar, r.data_checkin, r.data_checkout 
FROM hospedes AS h
JOIN reservas AS r ON r.cpf_hospede = h.cpf
JOIN quartos AS q ON q.quarto_id = r.quarto_id
WHERE h.cpf = '23456789012'


--4. Listar as reservas especificando
--Um periodo de data inicio e fim
-- Saida esperada: nome hospede, tipo quarto, andar, data checkin e checkout

SELECT h.nome, q.tipo, q.andar, r.data_checkin, r.data_checkout 
FROM hospedes AS h
JOIN reservas AS r ON r.cpf_hospede = h.cpf
JOIN quartos AS q ON q.quarto_id = r.quarto_id
WHERE r.data_checkin BETWEEN '2025-09-02' AND '2025-09-05'  

--5. Listar os valores gastos por reserva
--ordenados pelo maior
--saida esperada: reserva id, todos os totais,
--desconto, percentual

SELECT reserva_id, total_reserva, percentual_desconto
    FROM reservas

SELECT
    p.descricao, SUM(cp.quantidade) AS "Quantidade Total"
FROM
    produtos AS p
JOIN consumos_produtos AS cp
ON cp.produto_id = p.produto_id
GROUP BY p.descricao
ORDER BY "Quantidade Total" DESC;

SELECT h.nome, r.data_checkin, r.data_checkout, r.status
    FROM hospedes AS h
JOIN reservas AS r ON r.cpf_hospede = h.cpf
WHERE r.status = 'Pendente';










































































