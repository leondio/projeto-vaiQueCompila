new Chart(document.getElementById("grafico"), {
    type: 'bar',
    data: {
        labels: ["incidente", "causa",],
        datasets: [
            {
                label: "incidente",
                backgroundColor: ["#3e95cd", "#8e5ea2", "#3cba9f", "#e8c3b9", "#c45850"],
                data: [grafico]
            }
        ]
    },
    options: {
        legend: { display: false },
        title: {
            display: true,
            text: 'Predicted world population (millions) in 2050'
        }
    }
});
$(document).ready(function () {
    $('grafico').click(function () {
        var incidente = ($(this)).attr('value')
        $.ajax({
            type: 'POST',
            url: '/sigla/',
            data: { "incidente": incidente },
            success: function (data) {
                $('#incidente').text(data.grafico.identificador)
                $('#causa').text(data.grafico.causa);
            }
        });
    });
})


