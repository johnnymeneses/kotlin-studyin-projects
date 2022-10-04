package com.example.gmailrecyclerview.model

import kotlinx.android.synthetic.main.email_item.view.*

//todo dataclass precisa de pelo menos um parâmetro em seu construtor
//modelo de dados
data class Email(
    val user: String,
    val subject: String,
    val preview: String,
    val date: String,
    val stared: Boolean,
    val unread: Boolean,
    var selected: Boolean = false
)


///Para não precisar criar email, por email, vamos usar um padrao chamado Builer
//para gerar esses e-mails
//criar modelos de e-mails
class EmailBuilder {
    var user: String = ""
    var subject: String = ""
    var preview: String = ""
    var date: String = ""
    var stared: Boolean = false
    var unread: Boolean = false

    fun build(): Email = Email(user, subject, preview, date, stared, unread, false)
}

//Responsavel por gerar os emails - Função globao Bloco DSL
fun email(block: EmailBuilder.() -> Unit): Email = EmailBuilder().apply(block).build()



//função teste e-mails
//fun fakeEmails() = listOf(
fun fakeEmails() :MutableList<Email> = mutableListOf(
    email {
        user = "Netflix"
        subject = "Johnny confirme as configurações da sua Conta do Goog"
        preview = "Agradecemos por se conectar ao Google no seu dispositivo Windows.\n" +
                "Confirme se as configurações da sua Conta do Google ainda são ideais para você."
        date = "25 Set"
        stared = true
        unread = true
    },email {
        user = "PicPay"
        subject = "Que tal uma graninha extra? 🤑"
        preview = "Conte com a gente pra ter o controle das suas finanças, até mesmo na hora de pedir seu empréstimo com toda a segurança."
        date = "15 Mai"
        stared = false
        unread = true
    },
    email {
        user = "Alura"
        subject = "🏃‍♀️A promoção acaba hoje! Cursos a partir de R$22,90 cada."
        preview = "Aprenda as habilidades mais recentes e progrida na sua carreira. Cursos a partir de R$22,90 cada"
        date = " 25 Jan"
        stared = false
        unread = true
    },
    email {
        user = "FilipeFlop"
        subject = "Esqueça a Solda! Conheça o Kit Girassol\n"
        preview = "O Kit Especial Girassol Seguidor de Luz é o primeiro Kit Especial desenvolvido para ser plug-and-play, "
        date = "26 Set"
        stared = true
        unread = true
    },

    email {
        user = "El Pais"
        subject = "¡Últimas horas! Seis meses de suscripción por solo 1 € al mes"
        preview = "Oferta exclusiva: suscríbete 6 meses por 60 € 6 €"
        date = "10 Out"
        stared = false
        unread = true
    },

    email {
        user = "Oracle"
        subject = "And the CloudWorld party headliner is…"
        preview = "Register for CloudWorld to learn how the latest Autonomous Database technology can give your business a boost, and hear from customers who are seeing the benefits"
        date = "15 Ago"
        stared = false
        unread = true
    },

    email {
        user = "XP Investimentos"
        subject = "Cartão XP com Investback!"
        preview = "Com o cartão XP Visa Infinite, você não precisa de um limite mínimo de gasto mensal para ficar isento da anuidade do mês. Aqui, a anuidade é ZERADA para sempre, sem pegadinhas"
        date = "10 Set"
        stared = false
        unread = true
    },

    email {
        user = "Alura"
        subject = "The end of summer calls for big savings."
        preview = "Celebrate the last days of sun with this limited time offer."
        date = "11 Abr"
        stared = false
        unread = false
    },

    email {
        user = "Microsoft"
        subject = "[Webinar] Acelere a transformação do seu negócio"
        preview = "Participe do Acelere a transformação do seu negócio, webinar dedicado aos proprietários de PMEs, focado em conhecer as tendências e oportunidades do trabalho moderno, a fim de empoderar os funcionários e melhorar o atendimento ao cliente."
        date = "02 Fev"
        stared = false
        unread = false
    },


    email {
        user = "STB"
        subject = "EXPERIMENTO CONVIDA | Saiba tudo sobre estudar na Irlanda num super evento!"
        preview = "Você é nosso convidado para o evento exclusivo que o Consulado Geral da Irlanda e a Select Ireland prepararam."
        date = " 29 Fev"
        stared = false
        unread = false
    },

    email {
        user = "Uber"
        subject = "Johnny, seu endereço de e-mail foi alterado"
        preview = "O endereço de e-mail da sua conta da Uber foi alterado para johnny.meneses@outlook.com."
        date = " 11 Jul"
        stared = false
        unread = true
    },


    email {
        user = "Paypal"
        subject = "Johnny, temos um cupom de R$50 para você!"
        preview = "Temos uma surpresa de R$50 para você!"
        date = " 14 Nov"
        stared = false
        unread = true
    },


    email {
        user = "CertiProf"
        subject = "Boost your professional growth with CertiProf"
        preview = "We invite you to enhance your career path with our certifications portfolio."
        date = "11 Jun"
        stared = false
        unread = true
    },
    email {
        user = "Google"
        subject = "Johnny, confirme as configurações da sua Conta do Goog"
        preview = "Agradecemos por se conectar ao Google no seu dispositivo Windows.\n" +
                "Confirme se as configurações da sua Conta do Google ainda são ideais para você."
        date = "25 Set"
        stared = true
        unread = true
    },
    email {
        user = "Udemy"
        subject = "🏃‍♀️A promoção acaba hoje! Cursos a partir de R$22,90 cada."
        preview = "Aprenda as habilidades mais recentes e progrida na sua carreira. Cursos a partir de R$22,90 cada"
        date = " 25 Jan"
        stared = false
        unread = true
    },
    email {
        user = "FilipeFlop"
        subject = "Esqueça a Solda! Conheça o Kit Girassol\n"
        preview = "O Kit Especial Girassol Seguidor de Luz é o primeiro Kit Especial desenvolvido para ser plug-and-play, "
        date = "26 Set"
        stared = true
        unread = true
    },
    email {
        user = "PicPay"
        subject = "Que tal uma graninha extra? 🤑"
        preview = "Conte com a gente pra ter o controle das suas finanças, até mesmo na hora de pedir seu empréstimo com toda a segurança."
        date = "15 Mai"
        stared = false
        unread = true
    },
    email {
        user = "El Pais"
        subject = "¡Últimas horas! Seis meses de suscripción por solo 1 € al mes"
        preview = "Oferta exclusiva: suscríbete 6 meses por 60 € 6 €"
        date = "10 Out"
        stared = false
        unread = true
    },

    email {
        user = "Oracle"
        subject = "And the CloudWorld party headliner is…"
        preview = "Register for CloudWorld to learn how the latest Autonomous Database technology can give your business a boost, and hear from customers who are seeing the benefits"
        date = "15 Ago"
        stared = false
        unread = true
    },

    email {
        user = "XP Investimentos"
        subject = "Cartão XP com Investback!"
        preview = "Com o cartão XP Visa Infinite, você não precisa de um limite mínimo de gasto mensal para ficar isento da anuidade do mês. Aqui, a anuidade é ZERADA para sempre, sem pegadinhas"
        date = "10 Set"
        stared = false
        unread = true
    },

    email {
        user = "Udacity"
        subject = "The end of summer calls for big savings."
        preview = "Celebrate the last days of sun with this limited time offer."
        date = "11 Abr"
        stared = false
        unread = false
    },

    email {
        user = "Microsoft"
        subject = "[Webinar] Acelere a transformação do seu negócio"
        preview = "Participe do Acelere a transformação do seu negócio, webinar dedicado aos proprietários de PMEs, focado em conhecer as tendências e oportunidades do trabalho moderno, a fim de empoderar os funcionários e melhorar o atendimento ao cliente."
        date = "02 Fev"
        stared = false
        unread = false
    },


    email {
        user = "Experimento"
        subject = "EXPERIMENTO CONVIDA | Saiba tudo sobre estudar na Irlanda num super evento!"
        preview = "Você é nosso convidado para o evento exclusivo que o Consulado Geral da Irlanda e a Select Ireland prepararam."
        date = " 29 Fev"
        stared = false
        unread = false
    },

    email {
        user = "Uber"
        subject = "Johnny, seu endereço de e-mail foi alterado"
        preview = "O endereço de e-mail da sua conta da Uber foi alterado para johnny.meneses@outlook.com."
        date = " 11 Jul"
        stared = false
        unread = true
    },


    email {
        user = "Paypal"
        subject = "Johnny, temos um cupom de R$50 para você!"
        preview = "Temos uma surpresa de R$50 para você!"
        date = " 14 Nov"
        stared = false
        unread = true
    },


    email {
        user = "CertiProf"
        subject = "Boost your professional growth with CertiProf"
        preview = "We invite you to enhance your career path with our certifications portfolio."
        date = "11 Jun"
        stared = false
        unread = true
    }



)














