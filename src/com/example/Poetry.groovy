#! /usr/bin/env groovy

package com.example

class Poetry implements Serializable{
    def script
    Poetry(script){
        this.script = script
    }
    def PoetryInstallDevDeps{
        script.sh "poetry install"
    }
    def PoetryLint{
        script.sh "poetry run flake8 ."
    }
    def PoetryBandit{
        script.sh 'poetry run bandit -r . -c "pyproject.toml"'
    }
    def PoetryTest{
        script.sh "poetry run pytest"
    }
    def PoetryBump{
        script.sh "poetry version patch"
    }
}