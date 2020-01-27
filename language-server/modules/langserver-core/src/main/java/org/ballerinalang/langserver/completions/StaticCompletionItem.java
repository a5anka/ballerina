/*
 *  Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.ballerinalang.langserver.completions;

import org.ballerinalang.langserver.commons.LSContext;
import org.ballerinalang.langserver.commons.completion.LSCompletionItem;
import org.eclipse.lsp4j.CompletionItem;

/**
 * Represents a static Completion Item.
 * Eg: Code Snippet
 *
 * @since 1.2.0
 */
public class StaticCompletionItem implements LSCompletionItem {
    LSContext lsContext;
    CompletionItem completionItem;

    public StaticCompletionItem(LSContext lsContext, CompletionItem completionItem) {
        this.lsContext = lsContext;
        this.completionItem = completionItem;
    }

    @Override
    public String getSortText() {
        return null;
    }

    @Override
    public String setSortText() {
        return null;
    }

    @Override
    public CompletionItem getCompletionItem() {
        return this.completionItem;
    }

    public LSContext getLsContext() {
        return lsContext;
    }
}
