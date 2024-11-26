cd path/to/repoB
git remote add name path/to/repoa
git fetch name --tags
git merge --allow-unrelated-histories name/branch