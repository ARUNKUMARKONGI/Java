public class IntelliJFeatures {
    public static void main(String[] args) {
        /*
        1.Reformat, go to main menu-->code-->reformat code or ctrl+alt+L, gives proper indentation
        2. intellij can suggest possible solutions for errors. try removing t from out from below stmt
         execute and press alt+enter
        3. ctrl+D to copy any line pointed by the cursor
        4. to rename class,variable et`c select that keyword, press shift+f6 and rename
        5. Alt+f7 gives you the usage of any function or class written in the code
        7. ctrl+/ for single comment, ctrl+shift+/ for block comments
        8. Press Shift twice to search anywhere in the project or ctrl + L to search in the editor.
        9. ctrl+w for code selection
        10. ctrl+ O for override, ctrl + I for interfaces
        11. to push project to github repository, right click on project folder name, go to git
            and then click on manage remotes, the add github repository http link. example:
              https://github.com/ARUNKUMARKONGI/PackageCreation.git
        12. To update from git, go to file and click edit and make changes, come back to Intellij and click on uodate project
            to get the updates directly from git. or right click on each class file, go to git and click pull
        13. if there is github permission denied publickey error, create new ssh key and add it to your
             github account. (ssh and gpg key section under profile settings and follow the procedure
               given to generate ssh key*/
        int valu = 25;
        valu++;
        System.out.println("value of the variable is = " + valu);

    }
}

