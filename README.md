```
cd path/to/repoB
git remote add name path/to/repoa
git fetch name --tags
git merge --allow-unrelated-histories name/branch
```


| Goal                                         | Command                                                |
| -------------------------------------------- | ------------------------------------------------------ |
| Create a branch                              | `git checkout -b folderB-branch`                       |
| Remove others                                | `git rm -r --cached folderA folderC`                   |
| Work & push                                  | `git push -u origin folderB-branch`                    |
| Merge back safely                            | `git merge folderB-branch --allow-unrelated-histories` |
| (Optional) Filter only that folder’s history | `git subtree split --prefix=folderB -b folderB-only`   |
