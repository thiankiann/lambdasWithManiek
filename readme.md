Git - good practices

* commit powinien miec dobry opis
* commit powinien zawierac jedna zmiane (commit atomowy)
* amend - zmiana opisu tylko dla ostatniego commit-a (doklejanie zmian do ostatniego commit bez tworzenia nowego)
* podrozuj po historii i brunchach tylko przy czystym drzewie roboczym
* nie usuwaj bruncha na ktorym aktualnie sie znajdujesz
  
* git flow - w skrocie
    * master - brunch release- owy
    * develop - bruch developerski
    * feature branch - brunch rowijajacy dana funkcjonalnosc
        * po winien startowac od developa i dno niego finalnie byc mergowanym
* grunch
    *wlasny branch nie musi byc idealny(moze nie dzialac - moze zaiwrac komentarza //FIXMe lub //),
    ale wyslanie merge requesta z tego brancha musi zawierac "piekny kod"

Git - przydatne komendy
* git status
* git add .
* git commit -m "[tag] - message"
* git restore --staged file-name // zdejmij ze stage'a
* git checkout branch-name // przełącz się na branch-name
* git checkout -b branch-name // przełącz na nowo utworzony branch
* git reflog - Reflog is a mechanism to record when the tip of branches are updated. This command is to manage the information recorded in it. Basically every action you perform inside of Git where data is stored, you can find it inside of the reflog
* git log --graph  //rysujegraf historii w konsoli 
