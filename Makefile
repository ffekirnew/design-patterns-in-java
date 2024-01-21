TARGET_DIR := target
JAR_NAME := designpatterns-1.0-SNAPSHOT.jar

.PHONY: build run pattern test

build:
	@mvn clean install
	@mvn package

run:
	@java -jar $(TARGET_DIR)/$(JAR_NAME)
	
pattern:
	ifeq ($(filter iterator, $(MAKECMDGOALS)), iterator)
		@make build
		@echo "running iterator"
	else ifeq ($(filter mediator, $(MAKECMDGOALS)), mediator)
		@make build
		@echo "running mediator"
	else
		@make build
		@echo "running default"
	endif

test:
	@mvn test
