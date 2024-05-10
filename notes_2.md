# Домашка

0. создайте новый проект, загрузите его на гитхаб

```text
➜ myRepo  git init
➜ myRepo  git add .
➜ myRepo  git commit -m "init"
дальше публикуем на гитхаб
```

1. создайте конфликтную ситуацию, например так:

```text
➜ myRepo  git branch new_branch
➜ myRepo  echo somestring > Main.java
➜ myRepo  git status
On branch master
Your branch is up to date with 'origin/master'.
Changes not staged for commit:
(use "git add <file>..." to update what will be committed)
(use "git restore <file>..." to discard changes in working directory)
modified: Main.java
no changes added to commit (use "git add" and/or "git commit -a")
➜ myRepo   git add Main.java
➜ myRepo   git commit -m "somestring"
[master dba22e1] somestring
1 file changed, 1 insertion(+), 112 deletions(-)
➜ myRepo  git checkout new_branch
Switched to branch 'new_branch'
➜ myRepo  echo someNEWstring > Main.java
➜ myRepo  git add Main.java
➜ myRepo  git commit -m "someNEWstring"
[new_branch 360fabc] someNEWstring
1 file changed, 1 insertion(+), 112 deletions(-)
➜ myRepo  git merge master
Auto-merging
basic_programming/lesson_29/code/examples/src/l29/myRepo/Main.java
CONFLICT (content): Merge conflict in
basic_programming/lesson_29/code/examples/src/l29/myRepo/Main.java
Automatic merge failed; fix conflicts and then commit the result.
➜ myRepo  cat Main.java
<<<<<<< HEAD
someNEWstring
=======
somestring
>>>>>>> master
```

2. Решаете ее
3. Публикуете на гитхаб вторую ветку и создаете пул реквест в основную ветку (master <- new_branch)
4. И кидайте ссылку на репозиторий в личку