const main = document.getElementById("main")
const button = document.getElementById("button")
const textarea = document.getElementById("textarea")

function addTask(){
	const pElement = document.createElement("p")
	const pButton = document.createElement("button")
	pElement.textContent = textarea.value
	main.appendChild(pElement)
	main.appendChild(pButton)

        function rmTask(){
          pElement.remove()
          pButton.remove()
        }

        pButton.addEventListener("click", rmTask)
}

button.addEventListener("click", addTask)

