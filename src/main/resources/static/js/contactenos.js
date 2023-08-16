
function isValidEmail(email) {
    const regex = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$/;
    return regex.test(email);
}

const btn = document.getElementById('enviar');

btn.addEventListener('click', (e) => {
    const email = document.getElementById('email');

    console.log(email.value);

    if (!isValidEmail(email.value)) {
        e.preventDefault();

        Swal.fire({
            title: 'Error!',
            text: 'Email is not valid',
            icon: 'error',
            confirmButtonText: 'Cool'
        });
    }
});