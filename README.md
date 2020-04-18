# tp-git-pb2
Este es el primer tp de la cursada pb 2 2020

5. Realizar un commit y push al repositorio remoto y responder:

¿Qué sucedió cuando se intento hacer el segundo push?
No se pudo hacer porque da error diciendo que hay que hacer un pull porque el ws local está desactualizado con respecto al master.
error: failed to push some refs to 'https://github.com/cristianmedina23/tp-git-pb2'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.


¿Qué acciones hay que tomar antes de realizar el push?
Antes de hacer el push debo hacer un pull para traerme los últimos cambios.

¿Qué estrategia propondrían para evitar esta situación?
La estrategia es hacer siempre primero un pull antes de desarrollar para obtener lo último del repositorio y antes de pushear.Los pasos a seguir son commit-> pull -> push esto nos garantiza que en el momento que vamos a subir nuestro código al master va a estar actualizado y no va a pisar cambios de otros desarrolladores.

6. En el repositorio local ejecutar el siguiente comando git checkout -b develop ¿Qué acción realiza el parámetro -b?
El comando -b crea un nuevo branch

7. Crear ramas utilizando la recientemente creada develop utilizando los nombres de los desarrolladores

atomasini@DESKTOP-VL497I9 MINGW64 /c/tp-git-pb2/tp-git-pb2 (develop)
$ git checkout -b medina-cristian
Switched to a new branch 'medina-cristian'

atomasini@DESKTOP-VL497I9 MINGW64 /c/tp-git-pb2/tp-git-pb2 (medina-cristian)
$ git checkout develop
Switched to branch 'develop'

atomasini@DESKTOP-VL497I9 MINGW64 /c/tp-git-pb2/tp-git-pb2 (develop)
$ git checkout -b tomasini-arnaldo
Switched to a new branch 'tomasini-arnaldo'

atomasini@DESKTOP-VL497I9 MINGW64 /c/tp-git-pb2/tp-git-pb2 (tomasini-arnaldo)
$ git checkout develop
Switched to branch 'develop'

atomasini@DESKTOP-VL497I9 MINGW64 /c/tp-git-pb2/tp-git-pb2 (develop)
$

8. Modificar los archivos revirtiendo cambios o realizando mejoras, siempre procurando editar los
métodos y líneas. Ejemplo: separar cada acción (sumar, restar, multiplicar y dividir) en métodos
se modificaron archivos en los repositorio cristian-medina y tomasini-arnaldo.

9. Realizar en el repositorio remoto un merge request
¿Qué diferencias notaron en el proceso?
Las diferencias que notamos es que es al estar en otro branch y querer hacer un merge hubo muchos conflictos de código que tuvimos que 
solucionar primero en nuestro branch para poder pasar a develop. 

¿Qué estrategia utilizarían para evitar conflictos?
Para tratar de minimizar conflictos se podrian seguir los soguientes pasos:
1-Una vez pusheado todo nuestro código en nuestro branch particular hacer un checkout a develop o master según lo requiera y hacer pull.
2-mergear desde master develop a el branch particular y solucionar los conflictos en ese branch.
3-repetir paso 1 y 2.
4-mergear desde el branch particular al master o develop según lo requiera el paso debería ser transparente, ya que ambos branches estarían alineados.

