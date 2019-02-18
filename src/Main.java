public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // 版本控制系统:VCS, Version Control System
        // 1.集中式版本控制系统: SVN,Subversion
        // 2.分布式版本控制系统: Git,

        // SVN服务器: taoCode, SVNChina
        // Git服务器: gitee, github

        // Git使用
        // Git安装
        // 下载地址:https://git-scm.com/

        // 初始化版本库
        // git init
        // 注: 当前文件夹,有文件要进行版本控制

        // 查看当前版本库的状态
        // git status

        // 执行某个文件进行版本控制
        // git add 文件

        // 红色: 未进行版本控制的文件
        // 绿色: 新增文件

        // git信息配置
        // git config --global user.name "姓名"
        // git config --global user.email "邮箱"

        // 删除git的配置信息
        // git config --global --unset user.email

        // 查看git信息配置
        // git config --global --list

        // 注:
        // --system: 系统
        // --global: 当前用户
        // --local: 当前仓库

        // 提交修改
        // git commit -m "注释"

        // 查看日志
        // git log

        // 版本回退
        // git reset --hard 版本号
        // git reset --hard 251c950ee16d6a6426d3c1fa72e8e228f8ac6886
        // git reset --hard 251c

        // HEAD: 当前的指向,最后一次提交

        // 退回到HEAD的前一个指向
        // git reset --hard HEAD^       退1个版本
        // git reset --hard HEAD^^      退2个版本
        // git reset --hard HEAD~100    退100个版本

        // 查看所有日志
        // git reflog

        // 工作区, 暂存区, 版本库, 远程仓库
        // 工作区: 当前编辑的工程
        // 暂存区: 当执行了 git add后,文件会存入暂存区
        // 版本库: 当执行了 git commit后,把暂存区的内容提交到版本库
        // 注: 工作区, 暂存区, 版本库都在自己的电脑上
        // 暂存区,版本库在.git文件夹中
        // 远程仓库: git服务器

        // 练习
        // 1.给Girl添加购物方法
        // 2.add
        // 3.为Girl添加休息方法
        // 4.commit

        // 撤销修改
        // 1.工作区: 直接修改, 或命令: git checkout -- 文件
        // 2.暂存区: 直接修改,再次add, 或命令: git reset HEAD 文件
        // 3.版本库: 版本回退

    }
}
