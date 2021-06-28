package com.example.proyecto10_semana_11

class Contact {
    class Contact {
        class Contact : Serializable {
            var Firstname: String? = null
            var Lastname: String? = null
            var PhoneNumber: String? = null
            var Email: String? = null

            fun print(): String {
                return "Nombre(s): ${this.Firstname}\n" +
                        "Apellido(s): ${this.Lastname}\n" +
                        "Teléfono: ${this.PhoneNumber}\n" +
                        "Correo electrónico: ${this.Email}";
            }
        }
    }
}