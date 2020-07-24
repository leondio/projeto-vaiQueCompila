#selecionar os eventos entre duas datas

SELECT 
    *
FROM
    itmn_evento
WHERE
    data_evt BETWEEN STR_TO_DATE('04/03/2020', '%d/%m/%Y') AND STR_TO_DATE('05/03/2020', '%d/%m/%Y');

# contar os alarmes em uma data específica

SELECT 
    itmn_alarme.descricao, COUNT(itmn_alarme.id_alarme)
FROM
    itmn_evento
        INNER JOIN
    itmn_alarme ON itmn_evento.id_alarme = itmn_alarme.id_alarme
WHERE
    itmn_evento.data_evt = STR_TO_DATE('01/01/2020', '%d/%m/%Y')
GROUP BY itmn_alarme.id_alarme;

# contar os alarmes entre duas datas

SELECT 
    itmn_alarme.descricao, COUNT(itmn_alarme.id_alarme) AS total
FROM
    itmn_evento
        INNER JOIN
    itmn_alarme ON itmn_evento.id_alarme = itmn_alarme.id_alarme
WHERE
    itmn_evento.data_evt BETWEEN STR_TO_DATE('01/01/2020', '%d/%m/%Y') AND STR_TO_DATE('02/01/2020', '%d/%m/%Y')
GROUP BY itmn_alarme.id_alarme;