# Redundant access to an object (RedundantAccessToObject)

 Type | Scope | Severity | Activated<br>by default | Minutes<br>to fix | Tags 
 :-: | :-: | :-: | :-: | :-: | :-: 
 `Code smell` | `BSL` | `Info` | `Yes` | `1` | `standard`<br>`clumsy` 

## Parameters 

 Name | Type | Description | Default value 
 :-: | :-: | :-- | :-: 
 `checkObjectModule` | `Boolean` | ```Check object modules``` | ```true``` 
 `checkFormModule` | `Boolean` | ```Check form modules``` | ```true``` 
 `checkRecordSetModule` | `Boolean` | ```Check record set modules``` | ```true``` 

<!-- Блоки выше заполняются автоматически, не трогать -->
## Description
<!-- Описание диагностики заполняется вручную. Необходимо понятным языком описать смысл и схему работу -->

## Examples
<!-- В данном разделе приводятся примеры, на которые диагностика срабатывает, а также можно привести пример, как можно исправить ситуацию -->

## Sources
<!-- Необходимо указывать ссылки на все источники, из которых почерпнута информация для создания диагностики -->
<!-- Примеры источников

* Источник: [Стандарт: Тексты модулей](https://its.1c.ru/db/v8std#content:456:hdoc)
* Полезная информация: [Отказ от использования модальных окон](https://its.1c.ru/db/metod8dev#content:5272:hdoc)
* Источник: [Cognitive complexity, ver. 1.4](https://www.sonarsource.com/docs/CognitiveComplexity.pdf) -->

## Snippets

<!-- Блоки ниже заполняются автоматически, не трогать -->
### Diagnostic ignorance in code

```bsl
// BSLLS:RedundantAccessToObject-off
// BSLLS:RedundantAccessToObject-on
```

### Parameter for config

```json
"RedundantAccessToObject": {
    "checkObjectModule": true,
    "checkFormModule": true,
    "checkRecordSetModule": true
}
```
