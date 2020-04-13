
Task:
{name:String,conditionGroup:ConditionGroup,action:Action}
[boolean isSatisfy(Fact)]
[void doAction(Fact)]

ConditionGroup:
{conditions:List<Condition>}
[boolean isSatisfy(Fact)]

Condition:
{type:Enum,key:String,value:String}
[boolean isSatisfy(Fact)]

Fact:
{type:Enum,key:String,value:String}
[String getFact(String)]

Action:
{type:Enum,key:String,value:String}
[String getFact(String)]
