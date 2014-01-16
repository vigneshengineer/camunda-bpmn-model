/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.camunda.bpm.xml.model.testmodel.instance;

import org.camunda.bpm.xml.model.ModelBuilder;
import org.camunda.bpm.xml.model.impl.instance.ModelTypeInstanceContext;
import org.camunda.bpm.xml.model.type.ModelElementTypeBuilder;

import static org.camunda.bpm.xml.model.testmodel.TestModelConstants.MODEL_NAMESPACE;
import static org.camunda.bpm.xml.model.testmodel.TestModelConstants.TYPE_NAME_FRIEND_RELATIONSHIP_DEFINITION;
import static org.camunda.bpm.xml.model.type.ModelElementTypeBuilder.ModelTypeInstanceProvider;

/**
 * @author Sebastian Menski
 */
public class FriendRelationshipDefinition extends RelationshipDefinition {

  public static void registerType(ModelBuilder modelBuilder) {
    ModelElementTypeBuilder typeBuilder = modelBuilder.defineType(FriendRelationshipDefinition.class, TYPE_NAME_FRIEND_RELATIONSHIP_DEFINITION)
      .namespaceUri(MODEL_NAMESPACE)
      .extendsType(RelationshipDefinition.class)
      .instanceProvider(new ModelTypeInstanceProvider<FriendRelationshipDefinition>() {
        @Override
        public FriendRelationshipDefinition newInstance(ModelTypeInstanceContext instanceContext) {
          return new FriendRelationshipDefinition(instanceContext);
        }
      });

    typeBuilder.build();
  }

  public FriendRelationshipDefinition(ModelTypeInstanceContext instanceContext) {
    super(instanceContext);
  }

}